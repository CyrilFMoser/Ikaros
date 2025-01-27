package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[(Byte,Boolean), T_B], T_B]) extends T_A[T_A[((Int,Char),(Char,Int)), T_A[(Byte,Int), T_B]], T_B]
case class CC_B() extends T_A[T_A[((Int,Char),(Char,Int)), T_A[(Byte,Int), T_B]], T_B]
case class CC_C(a: CC_B, b: CC_B, c: T_B) extends T_B
case class CC_D(a: Char, b: Int, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), CC_B(), _) => 0 
  case CC_D(_, _, CC_A(_)) => 1 
}
}