package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[(Byte,Boolean), Char],T_A[Byte, Int])) extends T_A[C, T_A[T_A[Char, Byte], Char]]
case class CC_B[D](a: CC_A[D], b: T_A[(Byte,(Boolean,Char)), D], c: D) extends T_A[CC_A[T_A[Char, Byte]], D]
case class CC_C(a: (T_A[Boolean, Char],CC_B[Char]), b: Char, c: Boolean) extends T_A[CC_A[T_A[Char, Byte]], CC_A[Char]]

val v_a: T_A[CC_A[T_A[Char, Byte]], CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}