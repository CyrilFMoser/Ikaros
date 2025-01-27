package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Byte,T_A)) extends T_A
case class CC_B[C](a: T_B[C, CC_A], b: (T_B[(Byte,Boolean), Char],T_B[Byte, CC_A])) extends T_B[C, CC_A]
case class CC_C[D](a: CC_A) extends T_B[D, CC_A]
case class CC_D[E](a: CC_A) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), (_,_)), _) => 0 
  case CC_B(CC_B(CC_C(_), (_,_)), _) => 1 
  case CC_B(CC_B(CC_D(_), (_,_)), _) => 2 
  case CC_B(CC_C(_), _) => 3 
  case CC_B(CC_D(CC_A(_)), _) => 4 
  case CC_C(CC_A((_,_))) => 5 
  case CC_D(CC_A((_,_))) => 6 
}
}