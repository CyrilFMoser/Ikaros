package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, D]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A(_, _, (CC_A(_, _, _),CC_B(_))) => 1 
  case CC_A(_, _, (CC_B(_),CC_A(_, _, _))) => 2 
  case CC_A(_, _, (CC_B(_),CC_B(_))) => 3 
  case CC_B(CC_A(_, _, (_,_))) => 4 
  case CC_B(CC_B(CC_A(_, _, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
}
}