package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_B, b: (T_B[(Int,Byte), T_A],CC_A), c: Char) extends T_A
case class CC_D[C](a: C) extends T_B[CC_A, C]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B(CC_A(), CC_A())) => 1 
  case CC_D(CC_B(CC_A(), CC_B(_, _))) => 2 
  case CC_D(CC_B(CC_A(), CC_C(_, _, _))) => 3 
  case CC_D(CC_B(CC_B(_, _), CC_A())) => 4 
  case CC_D(CC_B(CC_B(_, _), CC_B(_, _))) => 5 
  case CC_D(CC_B(CC_B(_, _), CC_C(_, _, _))) => 6 
  case CC_D(CC_B(CC_C(_, _, _), CC_A())) => 7 
  case CC_D(CC_B(CC_C(_, _, _), CC_B(_, _))) => 8 
  case CC_D(CC_B(CC_C(_, _, _), CC_C(_, _, _))) => 9 
  case CC_D(CC_C(CC_B(_, _), (_,_), _)) => 10 
}
}