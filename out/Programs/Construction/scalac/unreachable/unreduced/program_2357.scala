package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: ((T_B,T_B),(T_B,Boolean))) extends T_A[T_A[T_A[T_B]]]
case class CC_B[B]() extends T_B
case class CC_C(a: T_A[CC_A], b: (CC_A,T_A[Byte]), c: T_A[CC_A]) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (CC_A(_, _),_), _) => 1 
  case CC_D(CC_B()) => 2 
  case CC_D(CC_C(_, (_,_), _)) => 3 
  case CC_D(CC_D(CC_B())) => 4 
  case CC_D(CC_D(CC_C(_, _, _))) => 5 
  case CC_D(CC_D(CC_D(_))) => 6 
}
}