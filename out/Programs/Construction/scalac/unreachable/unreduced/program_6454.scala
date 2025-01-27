package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: (T_A[Byte],T_A[Boolean])) extends T_A[Byte]
case class CC_B(a: T_B) extends T_A[Byte]
case class CC_C(a: (T_A[Byte],T_B)) extends T_B
case class CC_D(a: Byte, b: CC_A, c: T_A[Byte]) extends T_B
case class CC_E(a: T_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _),CC_C(_))) => 0 
  case CC_C((CC_A(_, _),CC_D(_, _, _))) => 1 
  case CC_C((CC_A(_, _),CC_E(_))) => 2 
  case CC_C((CC_B(_),CC_C(_))) => 3 
  case CC_C((CC_B(_),CC_D(_, _, _))) => 4 
  case CC_C((CC_B(_),CC_E(_))) => 5 
  case CC_D(_, CC_A(_, _), _) => 6 
}
}
// This is not matched: CC_E(_)