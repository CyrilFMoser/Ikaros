package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B[B](a: (T_A[Char],T_A[CC_A]), b: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), CC_A()) => 1 
  case CC_B((CC_B(_, _),_), CC_A()) => 2 
}
}