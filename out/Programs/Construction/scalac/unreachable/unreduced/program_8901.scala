package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[T_A[Char]], b: CC_A) extends T_A[Char]
case class CC_C(a: CC_B) extends T_A[CC_B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}