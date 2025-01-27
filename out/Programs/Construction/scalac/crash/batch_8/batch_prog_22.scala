package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A, c: (T_B[T_A, T_A],T_B[(Boolean,Boolean), T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), _) => 0 
  case CC_A(_, CC_A(_, CC_B(), (_,_)), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_), (_,_)), _) => 2 
  case CC_A(_, CC_B(), _) => 3 
  case CC_A(_, CC_C(CC_A(_, _, _)), _) => 4 
  case CC_A(_, CC_C(CC_B()), _) => 5 
  case CC_A(_, CC_C(CC_C(_)), _) => 6 
  case CC_B() => 7 
  case CC_C(_) => 8 
}
}