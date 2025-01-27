package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: ((Int,CC_A),CC_B), c: T_B[Int, T_B[CC_B, CC_A]]) extends T_A
case class CC_D[C]() extends T_B[(CC_B,T_B[CC_B, Int]), C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_))) => 0 
  case CC_B(CC_A(CC_B(_))) => 1 
  case CC_B(CC_A(CC_C(_, _, _))) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(CC_C(CC_A(_), (_,_), _)) => 4 
  case CC_B(CC_C(CC_B(_), (_,_), _)) => 5 
  case CC_B(CC_C(CC_C(_, _, _), (_,_), _)) => 6 
}
}