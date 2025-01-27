package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[T_B[Int]], c: CC_A) extends T_A
case class CC_C(a: T_B[T_A], b: T_B[T_A], c: Char) extends T_B[T_A]
case class CC_D(a: ((T_A,Int),T_B[CC_C])) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), _) => 0 
  case CC_C(CC_C(_, _, _), CC_D(_), _) => 1 
  case CC_C(CC_D(_), CC_C(_, _, _), _) => 2 
  case CC_C(CC_D(_), CC_D(_), _) => 3 
  case CC_D(((_,_),_)) => 4 
}
}