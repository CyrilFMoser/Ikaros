package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: (T_B[CC_A],T_A), b: T_B[T_A]) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_B[CC_B]
case class CC_D(a: ((CC_C,Int),CC_C), b: T_B[Boolean], c: T_B[CC_C]) extends T_B[CC_B]
case class CC_E(a: (T_B[CC_B],Int)) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E((CC_C(_, _),_)) => 2 
  case CC_E((CC_D(_, _, _),_)) => 3 
  case CC_E((CC_E(_),_)) => 4 
}
}