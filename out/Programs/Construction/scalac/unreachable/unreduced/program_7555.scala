package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[E, (T_B[Byte, Int],T_A[Int, (Int,Byte)])]
case class CC_B() extends T_A[T_A[T_B[Char, Byte], T_B[Boolean, Byte]], (T_B[Byte, Int],T_A[Int, (Int,Byte)])]
case class CC_C() extends T_A[T_A[T_B[Char, Byte], T_B[Boolean, Byte]], (T_B[Byte, Int],T_A[Int, (Int,Byte)])]
case class CC_D[F](a: ((CC_B,CC_B),T_A[CC_C, CC_C]), b: T_A[Int, F]) extends T_B[CC_A[CC_B], CC_C]

val v_a: T_A[T_A[T_B[Char, Byte], T_B[Boolean, Byte]], (T_B[Byte, Int],T_A[Int, (Int,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()