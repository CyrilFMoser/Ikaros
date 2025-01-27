package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[(CC_B,Int)]) extends T_A
case class CC_D(a: Boolean, b: (Boolean,CC_A)) extends T_B[CC_B]
case class CC_E(a: T_A, b: Boolean) extends T_B[CC_B]
case class CC_F(a: CC_B) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(_, CC_B(_), (_,_)), _) => 1 
  case CC_E(CC_A(_, CC_C(_), (_,_)), _) => 2 
  case CC_E(CC_B(CC_A(_, _, _)), _) => 3 
  case CC_E(CC_C(_), _) => 4 
  case CC_F(CC_B(CC_A(_, _, _))) => 5 
}
}
// This is not matched: CC_E(CC_A(_, CC_A(_, _, _), (_,_)), _)