package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_B[E], b: Byte, c: (CC_B[(Boolean,Boolean)],T_A[Char, Int])) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _, (CC_B(),_)) => 2 
}
}