package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: (T_B[T_A, T_A],Int)) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_A
case class CC_D(a: (T_A,Byte)) extends T_B[CC_C[T_B[(Int,Int), CC_B]], Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (_,_)) => 0 
  case CC_A(_, CC_B(), (_,_)) => 1 
  case CC_A(_, CC_C(), (_,_)) => 2 
  case CC_B() => 3 
  case CC_C() => 4 
}
}