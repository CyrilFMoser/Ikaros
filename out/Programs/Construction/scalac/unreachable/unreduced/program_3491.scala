package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[(Boolean,Byte)]), b: (T_A[Byte],T_A[T_B]), c: T_B) extends T_A[Byte]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: Byte) extends T_B
case class CC_D[B](a: B) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(_),_), (CC_A(_, _, _),_), CC_C(_)) => 0 
  case CC_A((CC_C(_),_), (CC_A(_, _, _),_), CC_D(_)) => 1 
  case CC_A((CC_D(_),_), (CC_A(_, _, _),_), CC_C(_)) => 2 
  case CC_A((CC_C(_),_), (CC_B(_),_), CC_C(_)) => 3 
  case CC_A((CC_C(_),_), (CC_B(_),_), CC_D(_)) => 4 
  case CC_A((CC_D(_),_), (CC_B(_),_), CC_C(_)) => 5 
  case CC_A((CC_D(_),_), (CC_B(_),_), CC_D(_)) => 6 
  case CC_B(CC_A((_,_), (_,_), CC_C(_))) => 7 
  case CC_B(CC_A((_,_), (_,_), CC_D(_))) => 8 
  case CC_B(CC_B(CC_A(_, _, _))) => 9 
  case CC_B(CC_B(CC_B(_))) => 10 
}
}
// This is not matched: CC_A((CC_D(_),_), (CC_A(_, _, _),_), CC_D(_))