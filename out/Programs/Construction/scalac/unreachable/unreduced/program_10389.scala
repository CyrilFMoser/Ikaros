package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],Byte), b: Char) extends T_A[((Int,Boolean),T_A[Char])]
case class CC_B() extends T_A[((Int,Boolean),T_A[Char])]
case class CC_C(a: CC_A, b: T_A[CC_A]) extends T_A[((Int,Boolean),T_A[Char])]

val v_a: T_A[((Int,Boolean),T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 'x') => 0 
  case CC_A((_,_), _) => 1 
  case CC_B() => 2 
  case CC_C(CC_A((_,_), _), _) => 3 
}
}