package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B[B](a: T_B[T_A], b: T_B[T_A]) extends T_B[T_A]
case class CC_C(a: T_B[T_A], b: (Boolean,Byte)) extends T_B[T_A]
case class CC_D(a: (T_A,CC_C), b: T_A, c: T_B[T_B[T_A]]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, CC_B(_, _)), _) => 0 
  case CC_B(CC_B(_, CC_C(_, _)), _) => 1 
  case CC_B(CC_B(_, CC_D(_, _, _)), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_B(CC_D(_, _, _), _) => 4 
  case CC_C(CC_B(CC_B(_, _), CC_B(_, _)), (_,_)) => 5 
  case CC_C(CC_B(CC_C(_, _), CC_B(_, _)), (_,_)) => 6 
  case CC_C(CC_B(CC_D(_, _, _), CC_B(_, _)), (_,_)) => 7 
  case CC_C(CC_B(CC_B(_, _), CC_C(_, _)), (_,_)) => 8 
  case CC_C(CC_B(CC_C(_, _), CC_C(_, _)), (_,_)) => 9 
  case CC_C(CC_B(CC_D(_, _, _), CC_C(_, _)), (_,_)) => 10 
  case CC_C(CC_B(CC_B(_, _), CC_D(_, _, _)), (_,_)) => 11 
  case CC_C(CC_B(CC_C(_, _), CC_D(_, _, _)), (_,_)) => 12 
  case CC_C(CC_B(CC_D(_, _, _), CC_D(_, _, _)), (_,_)) => 13 
  case CC_C(CC_D((_,_), _, _), (_,_)) => 14 
  case CC_D((CC_A(_, _, _),CC_C(_, _)), CC_A(_, _, _), _) => 15 
}
}
// This is not matched: CC_C(CC_C(_, _), (_,_))