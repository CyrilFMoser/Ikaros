package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], C]
case class CC_B(a: T_A[Boolean, CC_A[Byte]]) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_A[(Boolean,Char), Byte], T_A[Char, Char]]]
case class CC_C[D](a: D, b: T_A[D, D], c: D) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_A[(Boolean,Char), Byte], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _, _) => 3 
}
}