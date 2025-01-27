package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: T_A[C, T_A[C, C]], c: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], b: CC_A[Boolean], c: T_A[Byte, T_A[T_B, Byte]]) extends T_A[T_A[T_B, CC_A[T_B]], T_A[T_A[T_B, CC_A[T_B]], T_A[T_B, CC_A[T_B]]]]
case class CC_C(a: T_A[T_A[CC_B, (Boolean,Byte)], T_A[T_A[CC_B, (Boolean,Byte)], T_A[CC_B, (Boolean,Byte)]]], b: CC_B, c: (Byte,T_A[T_B, CC_B])) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: Boolean) extends T_B

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_C(CC_A(_, _, _), CC_B(_, _, _), (_,_))) => 0 
  case CC_A(_, CC_A(_, _, _), CC_D()) => 1 
  case CC_A(_, CC_A(_, _, _), CC_E(CC_B(_, _, _), _)) => 2 
}
}