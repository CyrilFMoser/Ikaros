package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, (Char,Boolean)], b: T_B[T_A[(Byte,Boolean), Char], Int], c: T_A[T_B[Byte, Int], T_B[Int, Byte]]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte, Byte]], (T_A[Int, Byte],T_B[Boolean, Byte])]
case class CC_B(a: (CC_A,T_A[CC_A, CC_A])) extends T_A[T_B[T_B[Char, Byte], T_A[Byte, Byte]], (T_A[Int, Byte],T_B[Boolean, Byte])]

val v_a: T_A[T_B[T_B[Char, Byte], T_A[Byte, Byte]], (T_A[Int, Byte],T_B[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}