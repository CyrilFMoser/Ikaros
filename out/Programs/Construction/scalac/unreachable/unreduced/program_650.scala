package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B(a: T_B[T_A[(Boolean,Char), (Int,Boolean)], T_B[Byte, Char]], b: Int, c: T_B[T_B[Int, Int], T_A[Int, Int]]) extends T_B[CC_A[T_A[Byte, Byte], T_A[Boolean, Byte]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Byte, Char]]]
case class CC_C(a: T_A[CC_B, Int]) extends T_B[CC_A[T_A[Byte, Byte], T_A[Boolean, Byte]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Byte, Char]]]

val v_a: T_B[CC_A[T_A[Byte, Byte], T_A[Boolean, Byte]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A()) => 1 
}
}