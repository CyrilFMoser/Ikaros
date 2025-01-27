package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_A]) extends T_B[T_A]
case class CC_C(a: T_B[Byte]) extends T_B[T_A]
case class CC_D(a: CC_A, b: CC_B, c: Byte) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_A(), CC_B(CC_A(), _, CC_B(_, _, _)), 0) => 2 
  case CC_D(CC_A(), CC_B(CC_A(), _, CC_C(_)), 0) => 3 
  case CC_D(CC_A(), CC_B(CC_A(), _, CC_D(_, _, _)), 0) => 4 
  case CC_D(CC_A(), CC_B(CC_A(), _, CC_B(_, _, _)), _) => 5 
  case CC_D(CC_A(), CC_B(CC_A(), _, CC_D(_, _, _)), _) => 6 
}
}
// This is not matched: CC_D(CC_A(), CC_B(CC_A(), _, CC_C(_)), _)