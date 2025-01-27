package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]], c: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_B[(Byte,(Int,Boolean))], c: CC_B) extends T_A
case class CC_D(a: T_B[CC_C], b: T_B[T_B[CC_C]], c: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _, _), _, _) => 2 
  case CC_A(CC_B(), _, _) => 3 
  case CC_A(CC_C(_, _, _), _, _) => 4 
  case CC_B() => 5 
  case CC_C(_, _, _) => 6 
}
}