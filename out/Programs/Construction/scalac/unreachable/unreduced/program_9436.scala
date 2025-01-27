package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_B[Int, Byte]) extends T_B[CC_A, T_B[T_B[CC_A, T_A], CC_A]]
case class CC_C(a: T_B[CC_A, T_B[CC_A, (Int,Char)]], b: T_A, c: (T_B[T_A, Int],Int)) extends T_B[CC_A, T_B[T_B[CC_A, T_A], CC_A]]
case class CC_D(a: T_A, b: Boolean, c: (Int,Boolean)) extends T_B[CC_A, T_B[T_B[CC_A, T_A], CC_A]]

val v_a: T_B[CC_A, T_B[T_B[CC_A, T_A], CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, _) => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), (_,12)) => 1 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), (_,_)) => 2 
  case CC_D(_, _, (_,_)) => 3 
}
}