package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B(a: (CC_A[T_B],CC_A[T_B])) extends T_A[Byte, T_A[Byte, ((Byte,Int),T_B)]]
case class CC_C[D](a: T_A[Byte, D], b: CC_B, c: CC_B) extends T_A[Byte, D]
case class CC_D(a: CC_A[Boolean], b: CC_A[T_A[Byte, T_B]], c: T_A[Byte, CC_C[Int]]) extends T_B
case class CC_E(a: CC_A[CC_D]) extends T_B

val v_a: T_A[Byte, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C(CC_A(_, _), CC_B(_), CC_B(_))) => 1 
  case CC_C(CC_A(_, _), CC_B(_), CC_B((_,_))) => 2 
  case CC_C(CC_C(_, CC_B(_), CC_B(_)), CC_B(_), CC_B((_,_))) => 3 
}
}
// This is not matched: CC_A(_, CC_C(CC_C(_, _, _), CC_B(_), CC_B(_)))