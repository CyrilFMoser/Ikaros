package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C(a: T_A[T_A[Int, Byte], T_B[Int, Int]], b: (Boolean,T_B[Boolean, Char])) extends T_B[T_B[CC_B[Byte, Byte], T_A[Int, Int]], (T_A[Char, Boolean],T_A[Byte, (Boolean,Byte)])]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}