package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: (T_A[Boolean, Char],T_B[Int])) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
}
}