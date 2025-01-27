package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_A, c: (T_B[Int, T_A],Int)) extends T_A
case class CC_B(a: Int, b: T_B[Boolean, T_A], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A, b: C) extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,12)) => 0 
  case CC_A(_, _, (_,_)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}