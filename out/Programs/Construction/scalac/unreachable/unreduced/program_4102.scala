package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B[C](a: T_A, b: T_B[C, C], c: CC_A) extends T_B[CC_A, C]
case class CC_C[D, E](a: CC_B[E], b: (T_B[CC_A, Boolean],T_B[CC_A, Byte])) extends T_B[CC_A, D]
case class CC_D[F](a: T_B[CC_A, F]) extends T_B[CC_A, F]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _))) => 1 
  case CC_C(_, (CC_B(_, _, _),CC_C(_, _))) => 2 
  case CC_C(_, (CC_B(_, _, _),CC_D(_))) => 3 
  case CC_C(_, (CC_C(_, _),CC_B(_, _, _))) => 4 
  case CC_C(_, (CC_C(_, _),CC_C(_, _))) => 5 
  case CC_C(_, (CC_C(_, _),CC_D(_))) => 6 
  case CC_C(_, (CC_D(_),CC_B(_, _, _))) => 7 
  case CC_C(_, (CC_D(_),CC_C(_, _))) => 8 
  case CC_C(_, (CC_D(_),CC_D(_))) => 9 
  case CC_D(CC_C(_, (_,_))) => 10 
  case CC_D(CC_D(CC_B(_, _, _))) => 11 
  case CC_D(CC_D(CC_C(_, _))) => 12 
  case CC_D(CC_D(CC_D(_))) => 13 
}
}
// This is not matched: CC_D(CC_B(CC_A(_), _, CC_A(_)))