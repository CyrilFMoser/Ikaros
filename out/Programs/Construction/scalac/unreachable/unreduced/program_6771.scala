package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Char,T_B[T_A]), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[Int]
case class CC_D(a: T_B[T_B[Int]]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A((_,_), _)