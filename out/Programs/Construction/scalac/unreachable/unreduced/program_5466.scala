package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_A, b: (T_B[T_A, (Char,Boolean)],T_B[CC_A, T_A])) extends T_B[C, T_B[C, C]]
case class CC_C[D]() extends T_B[D, T_B[D, D]]
case class CC_D[E](a: CC_A) extends T_B[E, T_B[E, E]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), (_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(CC_A())