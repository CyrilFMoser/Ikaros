package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: Int) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_B, T_B[CC_B, CC_A]], b: (CC_A,CC_B), c: T_B[(CC_B,Byte), CC_B]) extends T_A
case class CC_D[C, D](a: C, b: T_A) extends T_B[Int, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, (_,_), _)) => 5 
}
}
// This is not matched: CC_C(_, _, _)