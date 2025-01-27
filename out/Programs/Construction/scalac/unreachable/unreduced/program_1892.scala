package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Byte,Boolean)]]) extends T_A[(T_A[Char],T_A[Byte])]
case class CC_B(a: (CC_A,T_A[Boolean]), b: CC_A) extends T_A[(T_A[Char],T_A[Byte])]
case class CC_C(a: Char, b: Byte, c: CC_B) extends T_A[(T_A[Char],T_A[Byte])]

val v_a: T_A[(T_A[Char],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_), _) => 1 
  case CC_C(_, _, CC_B(_, _)) => 2 
}
}