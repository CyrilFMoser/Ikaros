package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[((Boolean,Boolean),Boolean)]]
case class CC_B(a: CC_A, b: (CC_A,T_A[CC_A]), c: T_A[CC_A]) extends T_A[T_A[((Boolean,Boolean),Boolean)]]
case class CC_C[B](a: CC_B, b: T_A[B]) extends T_A[B]

val v_a: T_A[T_A[((Boolean,Boolean),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _, _), CC_C(_, _))) => 0 
  case CC_B(CC_A(CC_C(_, _)), (CC_A(_),CC_C(_, _)), CC_C(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}