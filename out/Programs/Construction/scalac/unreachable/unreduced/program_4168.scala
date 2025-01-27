package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: T_A[T_A[Byte]]) extends T_A[Boolean]
case class CC_B(a: Char) extends T_A[Boolean]
case class CC_C(a: CC_A, b: (T_A[Boolean],T_A[Boolean])) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_C(CC_A(_, _), (CC_A(_, _),CC_B(_))) => 3 
  case CC_C(CC_A(_, _), (CC_A(_, _),CC_C(_, _))) => 4 
  case CC_C(CC_A(_, _), (CC_B(_),CC_A(_, _))) => 5 
  case CC_C(CC_A(_, _), (CC_B(_),CC_B(_))) => 6 
  case CC_C(CC_A(_, _), (CC_B(_),CC_C(_, _))) => 7 
  case CC_C(CC_A(_, _), (CC_C(_, _),CC_A(_, _))) => 8 
  case CC_C(CC_A(_, _), (CC_C(_, _),CC_B(_))) => 9 
}
}
// This is not matched: CC_C(CC_A(_, _), (CC_C(_, _),CC_C(_, _)))