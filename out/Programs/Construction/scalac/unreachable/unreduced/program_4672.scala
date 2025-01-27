package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[Char, Int]), b: Char) extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: T_A[E, T_A[E, E]], b: D, c: CC_A[E]) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[Int, T_A[Int, Int]]) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, CC_C(_), _) => 1 
}
}