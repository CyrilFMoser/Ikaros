package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[Boolean, C]
case class CC_B(a: CC_A[T_A[Boolean, Int]]) extends T_B
case class CC_C(a: T_B, b: (CC_B,T_A[T_B, CC_B]), c: T_A[Boolean, CC_A[T_B]]) extends T_B
case class CC_D(a: T_A[Boolean, CC_A[T_B]], b: T_A[Boolean, CC_A[CC_C]], c: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_A(_)), CC_B(_)) => 0 
  case CC_D(_, CC_A(CC_A(_)), CC_C(_, (_,_), CC_A(_))) => 1 
}
}
// This is not matched: CC_D(_, CC_A(CC_A(_)), CC_D(CC_A(_), _, _))