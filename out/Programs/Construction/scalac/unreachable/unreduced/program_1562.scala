package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: (T_A[CC_A],T_A[Char]), b: T_A[CC_A], c: CC_A) extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, CC_A()) => 1 
  case CC_C() => 2 
}
}