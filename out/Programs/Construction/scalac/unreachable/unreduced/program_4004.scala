package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_B[Boolean]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: (T_B[T_A],Byte)) extends T_B[T_B[T_A]]
case class CC_C(a: CC_A) extends T_B[T_B[T_A]]
case class CC_D(a: T_B[T_B[T_A]]) extends T_B[T_B[T_A]]

val v_a: T_B[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,_)) => 0 
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_D(CC_B(_, _, (_,_))) => 2 
  case CC_D(CC_C(_)) => 3 
}
}
// This is not matched: CC_D(CC_D(_))