package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Byte, Boolean]], b: T_A[T_A[Char, Boolean], (Char,Byte)]) extends T_A[(T_A[Boolean, Int],T_A[Boolean, Byte]), T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_B(a: T_A[Int, CC_A]) extends T_A[(T_A[Boolean, Int],T_A[Boolean, Byte]), T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_C(a: Int, b: CC_A, c: CC_A) extends T_A[(T_A[Boolean, Int],T_A[Boolean, Byte]), T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[(T_A[Boolean, Int],T_A[Boolean, Byte]), T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}