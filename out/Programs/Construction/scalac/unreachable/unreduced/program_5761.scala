package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: (T_B[CC_A],T_A)) extends T_A
case class CC_C(a: CC_A, b: CC_B, c: CC_A) extends T_A
case class CC_D() extends T_B[Int]
case class CC_E(a: CC_A, b: T_B[T_B[Int]], c: CC_A) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,CC_A())) => 1 
  case CC_B(CC_A(), (_,CC_B(_, _))) => 2 
  case CC_B(CC_A(), (_,CC_C(_, _, _))) => 3 
  case CC_B(CC_B(CC_A(), (_,_)), (_,CC_A())) => 4 
  case CC_B(CC_B(CC_A(), (_,_)), (_,CC_B(_, _))) => 5 
  case CC_B(CC_B(CC_A(), (_,_)), (_,CC_C(_, _, _))) => 6 
  case CC_B(CC_B(CC_B(_, _), (_,_)), (_,CC_A())) => 7 
  case CC_B(CC_B(CC_B(_, _), (_,_)), (_,CC_B(_, _))) => 8 
  case CC_B(CC_B(CC_B(_, _), (_,_)), (_,CC_C(_, _, _))) => 9 
  case CC_B(CC_B(CC_C(_, _, _), (_,_)), (_,CC_A())) => 10 
  case CC_B(CC_B(CC_C(_, _, _), (_,_)), (_,CC_B(_, _))) => 11 
  case CC_B(CC_B(CC_C(_, _, _), (_,_)), (_,CC_C(_, _, _))) => 12 
  case CC_B(CC_C(CC_A(), CC_B(_, _), _), (_,CC_A())) => 13 
  case CC_B(CC_C(CC_A(), CC_B(_, _), _), (_,CC_B(_, _))) => 14 
  case CC_B(CC_C(CC_A(), CC_B(_, _), _), (_,CC_C(_, _, _))) => 15 
  case CC_C(_, CC_B(CC_B(_, _), _), CC_A()) => 16 
  case CC_C(_, CC_B(CC_C(_, _, _), _), CC_A()) => 17 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(), _), CC_A())