package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Int,T_B[T_A]), b: T_B[(T_A,(Char,Char))], c: T_B[T_A]) extends T_A
case class CC_B[B](a: T_B[Boolean], b: B, c: T_A) extends T_B[Boolean]
case class CC_C(a: T_B[T_B[T_A]], b: CC_A) extends T_B[Boolean]
case class CC_D(a: T_B[Boolean], b: T_B[CC_C], c: CC_C) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_B(_, _, _), _, _) => 2 
  case CC_D(CC_C(_, _), _, _) => 3 
  case CC_D(CC_D(_, _, CC_C(_, _)), _, _) => 4 
}
}