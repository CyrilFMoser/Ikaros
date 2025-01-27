package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Int], T_A], b: (T_B[T_A, (Boolean,Char)],Boolean)) extends T_A
case class CC_B[C](a: Boolean, b: T_B[C, C]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: T_A) extends T_B[CC_C, Int]
case class CC_E(a: T_B[T_B[CC_C, Int], CC_C]) extends T_B[CC_C, Int]
case class CC_F() extends T_B[CC_C, Int]

val v_a: T_B[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_D(CC_C(CC_A(_, _))) => 2 
  case CC_D(CC_C(CC_B(_, _))) => 3 
  case CC_D(CC_C(CC_C(_))) => 4 
  case CC_E(_) => 5 
  case CC_F() => 6 
}
}