package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Char, Char], Char], b: CC_A[T_A[Char, Boolean]], c: (CC_A[Boolean],T_A[Boolean, Boolean])) extends T_A[T_A[T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]]
case class CC_C[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), (_,_)), _) => 3 
  case CC_A(CC_B(CC_C(), CC_A(_, _), (_,_)), _) => 4 
  case CC_A(CC_C(), _) => 5 
  case CC_B(CC_A(CC_C(), _), CC_A(_, _), (CC_A(_, _),_)) => 6 
  case CC_B(CC_C(), CC_A(_, _), (CC_A(_, _),_)) => 7 
  case CC_C() => 8 
}
}
// This is not matched: CC_B(CC_A(CC_A(_, _), _), CC_A(_, _), (CC_A(_, _),_))