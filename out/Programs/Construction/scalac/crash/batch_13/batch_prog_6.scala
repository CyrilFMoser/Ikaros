package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Int]], b: (T_B[T_A],Int)) extends T_A
case class CC_B[B](a: B, b: B, c: T_A) extends T_B[B]
case class CC_C[C](a: Byte, b: T_B[C], c: CC_A) extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_A(CC_B(_, _, _), (_,_)), CC_A(CC_C(_, _, _), _), _) => 1 
  case CC_B(CC_A(CC_B(_, _, _), (_,_)), CC_A(CC_D(), _), _) => 2 
  case CC_B(CC_A(CC_C(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _), _) => 3 
  case CC_B(CC_A(CC_C(_, _, _), (_,_)), CC_A(CC_C(_, _, _), _), _) => 4 
  case CC_B(CC_A(CC_C(_, _, _), (_,_)), CC_A(CC_D(), _), _) => 5 
  case CC_B(CC_A(CC_D(), (_,_)), CC_A(CC_B(_, _, _), _), _) => 6 
  case CC_B(CC_A(CC_D(), (_,_)), CC_A(CC_C(_, _, _), _), _) => 7 
  case CC_B(CC_A(CC_D(), (_,_)), CC_A(CC_D(), _), _) => 8 
  case CC_C(_, CC_B(_, _, _), CC_A(CC_B(_, _, _), (_,_))) => 9 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_B(_, _, _), (_,_))) => 10 
  case CC_C(_, CC_D(), CC_A(CC_B(_, _, _), (_,_))) => 11 
  case CC_C(_, CC_B(_, _, _), CC_A(CC_C(_, _, _), (_,_))) => 12 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_C(_, _, _), (_,_))) => 13 
  case CC_C(_, CC_D(), CC_A(CC_C(_, _, _), (_,_))) => 14 
  case CC_C(_, CC_B(_, _, _), CC_A(CC_D(), (_,_))) => 15 
  case CC_C(_, CC_C(_, _, _), CC_A(CC_D(), (_,_))) => 16 
  case CC_C(_, CC_D(), CC_A(CC_D(), (_,_))) => 17 
  case CC_D() => 18 
}
}