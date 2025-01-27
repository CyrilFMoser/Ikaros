package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Char, Int]], b: (T_A[Char, Int],(Boolean,Byte)), c: T_A[Char, Int]) extends T_A[Char, Int]
case class CC_B(a: Int, b: T_A[T_A[Char, Int], T_A[Char, Int]]) extends T_A[Char, Int]
case class CC_C() extends T_A[Char, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),(_,_)), CC_A(_, _, _)) => 0 
  case CC_A(_, (CC_B(_, _),(_,_)), CC_A(_, _, _)) => 1 
  case CC_A(_, (CC_C(),(_,_)), CC_A(_, _, _)) => 2 
  case CC_A(_, (CC_A(_, _, _),(_,_)), CC_B(_, _)) => 3 
  case CC_A(_, (CC_B(_, _),(_,_)), CC_B(_, _)) => 4 
  case CC_A(_, (CC_C(),(_,_)), CC_B(_, _)) => 5 
  case CC_A(_, (CC_A(_, _, _),(_,_)), CC_C()) => 6 
  case CC_A(_, (CC_B(_, _),(_,_)), CC_C()) => 7 
  case CC_A(_, (CC_C(),(_,_)), CC_C()) => 8 
  case CC_B(_, _) => 9 
  case CC_C() => 10 
}
}