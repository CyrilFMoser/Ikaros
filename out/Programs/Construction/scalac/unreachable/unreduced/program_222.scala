package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B() extends T_B
case class CC_C(a: (CC_A,T_B), b: (((Int,Boolean),CC_A),T_A[T_B]), c: T_A[CC_A]) extends T_B
case class CC_D(a: (Byte,CC_A), b: T_A[T_A[Int]], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (_,_), _) => 1 
  case CC_D(_, CC_A(_, _, _), CC_B()) => 2 
}
}