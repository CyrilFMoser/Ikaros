package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Byte, Boolean]], b: T_A[Char, T_A[Byte, Int]]) extends T_A[Byte, T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]
case class CC_B() extends T_A[Byte, T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]
case class CC_C(a: T_A[Boolean, CC_A]) extends T_A[Byte, T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Boolean], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}