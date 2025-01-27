package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Int,(Int,Boolean)), T_B[Boolean, Int]], b: Boolean) extends T_A[(T_B[Char, Byte],T_A[Byte])]
case class CC_B() extends T_A[(T_B[Char, Byte],T_A[Byte])]
case class CC_C[D, E](a: CC_A, b: T_A[D], c: (T_B[Char, CC_B],Char)) extends T_B[D, E]
case class CC_D[F, G, H](a: CC_A) extends T_B[G, F]
case class CC_E[I, J](a: T_B[I, I]) extends T_B[I, J]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_C(_, _, _),'x')) => 0 
  case CC_C(CC_A(CC_D(_), _), _, (CC_C(_, _, _),'x')) => 1 
  case CC_C(CC_A(CC_E(_), _), _, (CC_C(_, _, _),'x')) => 2 
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_C(_, _, _),_)) => 3 
  case CC_C(CC_A(CC_D(_), _), _, (CC_C(_, _, _),_)) => 4 
  case CC_C(CC_A(CC_E(_), _), _, (CC_C(_, _, _),_)) => 5 
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_D(_),'x')) => 6 
  case CC_C(CC_A(CC_D(_), _), _, (CC_D(_),'x')) => 7 
  case CC_C(CC_A(CC_E(_), _), _, (CC_D(_),'x')) => 8 
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_D(_),_)) => 9 
  case CC_C(CC_A(CC_D(_), _), _, (CC_D(_),_)) => 10 
  case CC_C(CC_A(CC_E(_), _), _, (CC_D(_),_)) => 11 
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_E(_),'x')) => 12 
  case CC_C(CC_A(CC_D(_), _), _, (CC_E(_),'x')) => 13 
  case CC_C(CC_A(CC_E(_), _), _, (CC_E(_),'x')) => 14 
  case CC_C(CC_A(CC_C(_, _, _), _), _, (CC_E(_),_)) => 15 
  case CC_C(CC_A(CC_D(_), _), _, (CC_E(_),_)) => 16 
  case CC_C(CC_A(CC_E(_), _), _, (CC_E(_),_)) => 17 
  case CC_D(CC_A(CC_C(_, _, _), _)) => 18 
  case CC_D(CC_A(CC_D(_), _)) => 19 
  case CC_D(CC_A(CC_E(_), _)) => 20 
  case CC_E(CC_C(_, _, _)) => 21 
  case CC_E(CC_D(CC_A(_, _))) => 22 
  case CC_E(CC_E(CC_C(_, _, _))) => 23 
  case CC_E(CC_E(CC_D(_))) => 24 
  case CC_E(CC_E(CC_E(_))) => 25 
}
}