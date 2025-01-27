package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int) extends T_A[T_A[Char]]
case class CC_B[C](a: (T_A[CC_A],T_B[CC_A]), b: CC_A) extends T_A[C]
case class CC_C() extends T_A[T_A[Char]]
case class CC_D() extends T_B[CC_C]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B((CC_B(_, _),_), _) => 2 
  case CC_C() => 3 
}
}