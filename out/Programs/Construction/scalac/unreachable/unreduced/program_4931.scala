package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: (Boolean,T_B[Boolean])) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_) => 1 
}
}