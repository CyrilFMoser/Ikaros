package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: (CC_A,T_A)) extends T_A
case class CC_C(a: CC_B, b: CC_B, c: CC_A) extends T_A
case class CC_D(a: T_B[CC_B, CC_C], b: (T_A,Int), c: CC_A) extends T_B[CC_B, CC_C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _), (_,_)) => 0 
  case CC_B(CC_A(_, _), CC_B(_, _, _), (_,_)) => 1 
  case CC_B(CC_A(_, _), CC_C(_, _, _), (_,_)) => 2 
  case CC_B(CC_B(_, _, _), CC_A(_, _), (_,_)) => 3 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), (_,_)) => 4 
  case CC_B(CC_B(_, _, _), CC_C(_, _, _), (_,_)) => 5 
  case CC_B(CC_C(_, _, _), CC_A(_, _), (_,_)) => 6 
  case CC_B(CC_C(_, _, _), CC_B(_, _, _), (_,_)) => 7 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _), (_,_)) => 8 
}
}