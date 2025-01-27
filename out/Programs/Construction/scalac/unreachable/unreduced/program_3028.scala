package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, (T_A[Int, Int],T_B[Byte])]
case class CC_B[E](a: CC_A[E], b: Char, c: (Char,T_A[Byte, Char])) extends T_A[E, (T_A[Int, Int],T_B[Byte])]
case class CC_C[F]() extends T_A[F, (T_A[Int, Int],T_B[Byte])]

val v_a: T_A[Int, (T_A[Int, Int],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(_), _, (_,_))