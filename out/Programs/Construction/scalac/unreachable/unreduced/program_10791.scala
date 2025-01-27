package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Int]) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], C]
case class CC_B[E, F](a: CC_A[E, E], b: T_A[F, F], c: (CC_A[Char, Byte],CC_A[Int, Boolean])) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], E]
case class CC_C(a: Int) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], CC_B[Char, (Boolean,Char)]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, (CC_A(_),CC_A(_))) => 1 
}
}